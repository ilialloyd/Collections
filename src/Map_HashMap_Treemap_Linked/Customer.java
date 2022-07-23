package Map_HashMap_Treemap_Linked;

public class Customer {
          public String getTableNumber() {
            return tableNumber;
        }

        public void setTableNumber(String tableNumber) {
            this.tableNumber = tableNumber;
        }

        String tableNumber;
        String name;

        Customer(String tableNumber, String name) {
            this.tableNumber = tableNumber;
            this.name = name;
        }

        public String toString() {
            return tableNumber + ": " + name;
        }

    }


