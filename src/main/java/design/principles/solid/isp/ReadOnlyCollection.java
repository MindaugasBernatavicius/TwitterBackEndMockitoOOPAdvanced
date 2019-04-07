package design.principles.solid.isp;

public interface ReadOnlyCollection extends Collection {
    // void remove(); does not fit for any sublcass aswell
    // the Collection interface might be too broad
}
