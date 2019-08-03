package collections.homework;

import java.util.*;
import java.util.stream.Collectors;

public class OrderCalculator {
    public static void main(String[] args) {

        List<Customer> customers = Arrays.asList(
            new Customer(23, "Mindaugas", 30),
            new Customer(24, "Tomas Tomatomaitis", 33),
            new Customer(666, "Stasys Povilaitis", 88)
        );

        List<Order> orders = Arrays.asList(
            new Order(34950, 23, 4, 55.0D),
            new Order(4950, 23, 5, 98.50D),
            new Order(4950, 24, 2, 13.50D),
            new Order(4657, 666, 2, 991.50D),
            new Order(56588, 666, 2, 13.50D),
            new Order(45342, 666, 2, 13.50D)
        );

        // mapping customers and their orders by customers.id == orders.customerId
        Map<Customer, List<Order>> customerOrders = new HashMap<>();
        for (Order o: orders) {
            for (Customer c: customers){
                if(o.getCustomerId() == c.getId()){
                    if(customerOrders.containsKey(c))
                        customerOrders.get(c).add(o);
                    else
                        customerOrders.put(c, new ArrayList<Order>(){{add(o);}});
                }
            }
        }

        // calculating the sum for each order and adding into a sorted map
        // https://stackoverflow.com/questions/109383/sort-a-mapkey-value-by-values
        Map<Double, Customer> result = new TreeMap<>(Collections.reverseOrder());
        for (Map.Entry<Customer, List<Order>> entry : customerOrders.entrySet()) {
            // get the sum for each customers order
            double sum4customer = 0;
            for(Order o: entry.getValue())
                sum4customer += o.getOrderSumEuros();
            result.put(sum4customer, entry.getKey());
        }


        System.out.println("----------------------------------------");
        System.out.printf("%20s %20s", "SUM ALL ORDERS(€)", "NAME\n");
        System.out.println("----------------------------------------");
        for (Map.Entry<Double, Customer> entry : result.entrySet())
            System.out.printf("%20s %20s", entry.getKey(), entry.getValue().getName() + "\n");


//        Map<Customer, Double> orderSum = customers.stream()
//                .map(c.)
//                .collect(toSet());

//        humans.stream()
//                .filter(human -> superHumanIds.contains(human.getHumanId()))
//                .map(this::convert)
//                .forEach(superHumans::add);
//
//        superHumans.sort(Comparator.comparing(SuperHuman::getAge));
    }
}


class Customer {
    private int id;
    private String name;
    private int age;

    public Customer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Order {
    private int id;
    private int customerId;
    private int orderItemCount;
    private double orderSumEuros;

    public Order(int id, int customerId, int orderItemCount, double orderSumEuros) {
        this.id = id;
        this.customerId = customerId;
        this.orderItemCount = orderItemCount;
        this.orderSumEuros = orderSumEuros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getOrderItemCount() {
        return orderItemCount;
    }

    public void setOrderItemCount(int orderItemCount) {
        this.orderItemCount = orderItemCount;
    }

    public double getOrderSumEuros() {
        return orderSumEuros;
    }

    public void setOrderSumEuros(double orderSumEuros) {
        this.orderSumEuros = orderSumEuros;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", orderItemCount=" + orderItemCount +
                ", orderSumEuros=" + orderSumEuros +
                '}';
    }
}
