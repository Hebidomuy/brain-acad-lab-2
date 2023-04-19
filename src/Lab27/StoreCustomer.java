package Lab27;

import lombok.Data;
import lombok.NonNull;

@Data
public class StoreCustomer {
    @NonNull
    private int id;
    @NonNull
    private String fullName;
    @NonNull
    private String phoneNumber;
    @NonNull
    private String email;
    @NonNull
    private String city;
    @NonNull
    private String discountNumberCards;
}