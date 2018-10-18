package de.hskl.cs.master;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("MultiSetTest")
public class MultiSetTest {

    private static MultiSet<String> _multiSet;

    @BeforeAll
    public static void initMultiSet() {
        _multiSet = new MultiSet<>();
    }

    @Test
    @DisplayName("ADD: INCREMENTS VALUE IF OBJECT EXISTS")
    public void add() {
        _multiSet.add("SomethingToAdd");
        Assertions.assertEquals((Integer)1, _multiSet.get("SomethingToAdd"));
        _multiSet.add("SomethingToAdd");
        Assertions.assertEquals((Integer)2, _multiSet.get("SomethingToAdd"));
        _multiSet.add("SomethingToAdd");
        Assertions.assertEquals((Integer)3, _multiSet.get("SomethingToAdd"));
    }

    @Test
    @DisplayName("REMOVE: REMOVES OBJECT IF VALUE IS 1")
    public void remove() {
        _multiSet.add("SomethingToAdd");
        Assertions.assertEquals((Integer)1, _multiSet.get("SomethingToAdd"));
        _multiSet.remove("SomethingToAdd");
        Assertions.assertNull(_multiSet.get("SomethingToAdd"));
    }

    @Test
    @DisplayName("CONTAINS: RETURNS TRUE OR FALSE IF OBJECT CONTAINS IN SET OR NOT")
    public void contains() {
        _multiSet.add("SomethingToAdd");
        _multiSet.add("AnotherOneToAdd");
        Assertions.assertTrue(_multiSet.contains("SomethingToAdd"));
        Assertions.assertFalse(_multiSet.contains("ThisShouldNotContain"));
    }
}
