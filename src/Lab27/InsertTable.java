package Lab27;

import java.sql.*;

public class InsertTable {
    private static final String SQL_INSERT_QUERY =
            "INSERT INTO public.store_customer(" +
                    "full_name, phone_number, email, city, discount_card_number)" +
                    " VALUES (?, ?, ?, ?, ?)";

    public static void main(String[] args) {
        String dbHost = PostgreSQLSettings.URL;
        String dbUser = PostgreSQLSettings.USER;
        String dbPass = PostgreSQLSettings.PASS;

        String fullName = "John Smith";
        String phoneNumber = "123-456-7890";
        String email = "john.smith@example.com";
        String city = "New York";
        String discountCardNumber = "1234567890";

        try {
            Connection conn = DriverManager.getConnection(dbHost, dbUser, dbPass);
            PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_QUERY);
            // Готовим запрос в БД
            preparedStatement.setString(1, fullName);
            preparedStatement.setString(2, phoneNumber);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, city);
            preparedStatement.setString(5, discountCardNumber);

            // Выполняем запрос в БД
            int row = preparedStatement.executeUpdate();

            // результат выполнения
            System.out.println(row);

        } catch (SQLException e) {
            System.err.format("SQL error: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}