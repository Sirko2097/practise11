package view;

import java.util.List;

public class View {
    public void print(List<?> list) {
        for (Object aList : list) {
            System.out.println(aList);
        }
    }
}
