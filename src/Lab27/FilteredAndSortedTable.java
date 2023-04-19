package Lab27;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FilteredAndSortedTable {
    private static final String SQL_INSERT_QUERY = "SELECT * FROM StoreCustomer WHERE city = ? ORDER BY full_name";

    public static void main(String[] args) {
        String dbHost = PostgreSQLSettings.URL;
        String dbUser = PostgreSQLSettings.USER;
        String dbPass = PostgreSQLSettings.PASS;

        String city = "New York";

        try {
            Connection conn = DriverManager.getConnection(dbHost, dbUser, dbPass);
            PreparedStatement statement = conn.prepareStatement(SQL_INSERT_QUERY);
            statement.setString(1, city);

            ResultSet result = statement.executeQuery();

            List<StoreCustomer> customers = new ArrayList<>();

            while (result.next()) {
                int id = result.getInt("id");
                String fullName = result.getString("full_name");
                String phoneNumber = result.getString("phone_number");
                String email = result.getString("email");
                String cityResult = result.getString("city");
                String discountCardNumber = result.getString("discount_card_number");

                StoreCustomer customer = new StoreCustomer(id, fullName, phoneNumber, email, cityResult, discountCardNumber);
                customers.add(customer);
            }

            Collections.sort(customers, (c1, c2) -> c1.getFullName().compareTo(c2.getFullName()));

            for (StoreCustomer customer : customers) {
                System.out.println(customer.getFullName() + " - " + customer.getCity());
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
