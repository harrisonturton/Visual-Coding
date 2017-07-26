package main.java.view.util;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by harrisonturton on 26/7/17.
 */
public class Style {

    public static void addStyleClass(List<String> styleClasses, String newClass) {
        styleClasses.add(newClass);
    }

    public static void removeStyleClass(List<String> styleClasses, String oldClass) {
        styleClasses.stream().filter(x -> x != oldClass).collect(Collectors.toList());
    }
}