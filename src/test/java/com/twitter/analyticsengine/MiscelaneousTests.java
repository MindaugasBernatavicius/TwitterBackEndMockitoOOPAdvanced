package com.twitter.analyticsengine;

import com.twitter.core.model.message.SimpleTag;
import com.twitter.core.model.message.Tag;
import com.twitter.core.model.message.Tweet;
import com.twitter.core.model.user.User;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class MiscelaneousTests {
    @Test
    public void removingAMemeber_givenIncorrectEqualsMethod_removesFirstItem(){
        List<SimpleTag> listOfTags = new ArrayList<>();

        SimpleTag s1 = new SimpleTag("Tag text 1", "Mindaugas");
        SimpleTag s2 = new SimpleTag("Tag text 2", "Mindaugas");
        SimpleTag s3 = new SimpleTag("Tag text 3", "Mindaugas");

        listOfTags.add(s1);
        listOfTags.add(s2);
        listOfTags.add(s3);

        for (SimpleTag sTag: listOfTags) {
            System.out.println(sTag.getTagText());
        }

        listOfTags.remove(s3);

        for (SimpleTag sTag: listOfTags) {
            System.out.println(sTag.getTagText());
        }
    }

    @Test
    public void sortingCollectionOfIntegers(){
        List<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(6);
        intList.add(1);

        Iterator itr = intList.iterator();
        while(itr.hasNext())
            System.out.print(itr.next() + " ");
        System.out.println();

        Collections.sort(intList);

        Iterator itr2 = intList.iterator();
        while(itr2.hasNext())
            System.out.print(itr2.next() + " ");
        System.out.println();
    }

    @Test
    public void sortingCollectionOfTags_Comparable(){
        List<SimpleTag> intList = new ArrayList<>();
        intList.add(new SimpleTag("AA","ABC"));
        intList.add(new SimpleTag("BA","BB"));
        intList.add(new SimpleTag("CA","CBFF"));

        Iterator itr = intList.iterator();
        while(itr.hasNext())
            System.out.print(((SimpleTag)itr.next()).getTagText() + " ");
        System.out.println();

         Collections.sort(intList); // --> not possible to do w/o Comparable or Comparator!

        Iterator itr2 = intList.iterator();
        while(itr2.hasNext())
            System.out.print(((SimpleTag)itr2.next()).getTagText() + " ");
        System.out.println();
    }

    @Test
    public void sortingCollectionOfTags_ComparatorByNameLength() {
        List<SimpleTag> intList = new ArrayList<>();
        intList.add(new SimpleTag("AA","ABC"));
        intList.add(new SimpleTag("BA","BB"));
        intList.add(new SimpleTag("CA","CBFF"));

        Iterator itr = intList.iterator();
        while(itr.hasNext())
            System.out.print(((SimpleTag)itr.next()).getTagText() + " ");
        System.out.println();

        Collections.sort(intList, new SimpaleTagComparatorByAuthorNameLength());

        Iterator itr2 = intList.iterator();
        while(itr2.hasNext())
            System.out.print(((SimpleTag)itr2.next()).getTagText() + " ");
        System.out.println();
    }

    // TASK : implement another comparator - SimpaleTagComparatorByTagTextLength
    @Test
    public void sortingCollectionOfTags_ComparatorByTagTextLength() {
        List<SimpleTag> intList = new ArrayList<>();
        intList.add(new SimpleTag("AAC","AA"));
        intList.add(new SimpleTag("BADD","AA"));
        intList.add(new SimpleTag("CA","AA"));

        Iterator itr = intList.iterator();
        while(itr.hasNext())
            System.out.print(((SimpleTag)itr.next()).getTagText() + " ");
        System.out.println();

        Collections.sort(intList, new SimpaleTagComparatorByTagTextLength());

        Iterator itr2 = intList.iterator();
        while(itr2.hasNext())
            System.out.print(((SimpleTag)itr2.next()).getTagText() + " ");
        System.out.println();
    }

    // TASK : implement another comparator - Alphabetic
    @Test
    public void sortingCollectionOfTags_ComparatorByTagText() {
        List<SimpleTag> intList = new ArrayList<>();
        intList.add(new SimpleTag("ZZZ","AA"));
        intList.add(new SimpleTag("AAA","AA"));
        intList.add(new SimpleTag("BBB","AA"));

        Iterator itr = intList.iterator();
        while(itr.hasNext())
            System.out.print(((SimpleTag)itr.next()).getTagText() + " ");
        System.out.println();

        Collections.sort(intList, new SimpaleTagComparatorByTagText());

        Iterator itr2 = intList.iterator();
        while(itr2.hasNext())
            System.out.print(((SimpleTag)itr2.next()).getTagText() + " ");
        System.out.println();
    }
}

class SimpaleTagComparatorByAuthorNameLength implements Comparator<SimpleTag> {
    @Override
    public int compare(SimpleTag firstTag, SimpleTag secondTag) {
        return (secondTag.getAuthor().length() - firstTag.getAuthor().length());
    }
}

class SimpaleTagComparatorByTagTextLength implements Comparator<SimpleTag> {
    @Override
    public int compare(SimpleTag firstTag, SimpleTag secondTag) {
        return (secondTag.getTagText().length() - firstTag.getTagText().length());
    }
}

class SimpaleTagComparatorByTagText implements Comparator<SimpleTag> {
    @Override
    public int compare(SimpleTag firstTag, SimpleTag secondTag) {
        return (secondTag.getTagText().compareTo(firstTag.getTagText()) * -1);
    }
}