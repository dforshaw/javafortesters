package com.javafortesters.strings;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;

/**
 * Created with IntelliJ IDEA.
 * User: David Forshaw
 * Date: 10/14/2015
 * Time: 2:54 PM
 */

public class stringBuilderTestExamples {

    @Test
    public void stringBuilderTestChainingExample1() {

        StringBuilder builder = new StringBuilder();

        builder.append("Hello There")
                .replace(7,11, "World")
                .delete(5,7);

        assertThat(builder.toString(), is("HelloWorld"));
    }

    @Test
    public void stringBuilderTestCapacity1() {

        StringBuilder builder = new StringBuilder();

        assertThat(builder.capacity(), is(16));
    }

    @Test
    public void stringBuilderTestCapacity2() {

        StringBuilder sblen = new StringBuilder(512);

        assertThat(sblen.capacity(), is(512));
        assertThat(sblen.toString().length(), is(0));
    }

    @Test
    public void stringBuilderTestCapacityTrim() {

        StringBuilder builder = new StringBuilder();

        builder.ensureCapacity(600);

        builder.append("A really long phrase");

//        System.out.println("capacity: " + builder.capacity());
//        System.out.println("length: " + builder.toString().length());

        assertThat(builder.capacity(), is(600));
        assertThat(builder.toString().length(), is(20));

        builder.trimToSize();

//        System.out.println("capacity: " + builder.capacity());
//        System.out.println("length: " + builder.toString().length());

        assertThat(builder.capacity(), is(20));
        assertThat(builder.toString().length(), is(20));
    }

    @Test
    public void stringBuilderTestAppend() {

        StringBuilder builder = new StringBuilder();

        builder.append("> ");
        builder.append(1);
        builder.append(" + ");
        builder.append(2);

        char[] ca = {' ', '=', ' ', '3'};

        builder.append(ca);

        assertThat(builder.toString(), is("> 1 + 2 = 3"));
    }

    @Test
    public void stringBuilderTestExercise1() {

        StringBuilder builder = new StringBuilder();
//        System.out.println(builder.capacity());

        int before = builder.capacity();

        builder.append("A super duper long phrase");
//        System.out.println(builder.capacity());

        int after = builder.capacity();

        assertThat(after, is(greaterThan(before)));
    }

    @Test
    public void stringBuilderTestInsert() {

        StringBuilder builder = new StringBuilder("123890");

        builder.insert(3, "4567");

        assertThat(builder.toString(), is("1234567890"));
    }

    @Test
    public void stringBuilderTestInsertError() {

        StringBuilder builder = new StringBuilder("123890");

        try {
            builder.insert(7, "4567");

        } catch (StringIndexOutOfBoundsException e) {

            System.out.println("Error Message : " + e.getMessage());
            System.out.println("Error Stack Trace : " + e.getStackTrace());
        }

//        assertThat(builder.toString(), is("1234567890"));
    }

    @Test
    public void stringBuilderTestExercise2() {

        //part 1
        System.out.println("Part 1");
        StringBuilder builder = new StringBuilder();
        int beforeLength = builder.length();
        System.out.println("Before: " + beforeLength);
        assertThat("intial length of empty is 16", beforeLength, is(0));

        String phrase = "new phrase to insert";
        System.out.println("Phrase Length: " + phrase.length());

        builder.insert(beforeLength, phrase);
        int afterLength = builder.length();
        System.out.println("After: " + afterLength);
        assertThat("post-insert length of empty is 16", afterLength, is(beforeLength + phrase.length()));

        System.out.println(builder.toString());

        int insertPoint = afterLength;

        //part 2
        System.out.println("\n" + "Part 2");
        String phraseAtEnd = " | new phrase to insert at the end";
        beforeLength = builder.length();
        System.out.println("Before: " + beforeLength);
        System.out.println("Phrase Length: " + phraseAtEnd.length());
        builder.append(phraseAtEnd);
        afterLength = builder.length();
        System.out.println("After: " + afterLength);
        assertThat("post-append length of phrase", afterLength, is(beforeLength + phraseAtEnd.length()));

        System.out.println(builder.toString());

        //part 3
        System.out.println("\n" + "Part 3");
        String phraseInMiddle = " | new phrase to insert in the middle";
        beforeLength = builder.length();
        System.out.println("Before: " + beforeLength);
        System.out.println("Phrase Length: " + phraseInMiddle.length());
        builder.insert(insertPoint, phraseInMiddle);
        afterLength = builder.length();
        System.out.println("After: " + afterLength);
        assertThat("post-insert length of phrase", afterLength, is(beforeLength + phraseInMiddle.length()));

        System.out.println(builder.toString());
    }

    @Test
    public void stringBuilderTestInsertChar() {

        char[] ca = {'.', 'a', 'b', 'c', 'd', 'e', 'f'};

        StringBuilder builder = new StringBuilder("abgh");
        System.out.println(builder.toString());

        builder.insert(2, ca, 3, 4);
        System.out.println(builder.toString());

        assertThat(builder.toString(), is ("abcdefgh"));
    }

    @Test
    public void stringBuilderTestDelete() {

        StringBuilder builder = new StringBuilder("abcdefg");
        System.out.println(builder.toString());

        builder.delete(2, 4);
        System.out.println(builder.toString());

        assertThat(builder.toString(), is ("abefg"));
    }

    @Test
    public void stringBuilderTestDeleteCharAt() {

        StringBuilder builder = new StringBuilder("abcdefg");
        System.out.println(builder.toString());

        builder.deleteCharAt(2);
        System.out.println(builder.toString());

        assertThat(builder.toString(), is ("abdefg"));
    }

    @Test
    public void stringBuilderTestReplace() {

        StringBuilder builder = new StringBuilder("abcdefgh");
        System.out.println(builder.toString());

        builder.replace(0, 4, "12345678");
        System.out.println(builder.toString());

        assertThat(builder.toString(), is ("12345678efgh"));
    }

    @Test
    public void stringBuilderTestSetCharAt() {

        StringBuilder builder = new StringBuilder("012345678");
        System.out.println(builder.toString());

        builder.setCharAt(5, 'f');
        System.out.println(builder.toString());

        assertThat(builder.toString(), is ("01234f678"));
    }

    @Test
    public void stringBuilderTestReverse() {

        StringBuilder builder = new StringBuilder("0123456789");
        System.out.println(builder.toString());

        assertThat(builder.reverse().toString(), is ("9876543210"));

        System.out.println(builder.toString());
    }

    @Test
    public void stringBuilderTestSubstring() {

        StringBuilder builder = new StringBuilder("0123456789");
        System.out.println(builder.toString());

        System.out.println("Partial substring: " + builder.substring(3, 7).toString());

        assertThat(builder.substring(3, 7).toString(), is("3456"));

        System.out.println("Substring from a start index: " + builder.substring(3).toString());

        assertThat(builder.substring(3).toString(), is ("3456789"));
    }
}
