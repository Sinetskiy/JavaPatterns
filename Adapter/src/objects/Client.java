package objects;

import adapter.PrinterAdapter;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("text");
        list.add("text");
        list.add("text");
        list.add("text");

        PrinterAdapter printerAdapter = new PrinterAdapter();
        printerAdapter.print(list);

    }
}
