package bg.salesdatabase;

import bg.salesdatabase.model.Customer;
import bg.salesdatabase.model.Product;
import bg.salesdatabase.model.interfaces.BaseCustomer;

import java.lang.reflect.InvocationTargetException;
import java.util.function.Supplier;

public final class Utils {
    public static Customer generateCustomer(final String name,
                                            final String email,
                                            final String creditCardNumber) {
        final Customer customer = new Customer();
        customer.setName(name);
        customer.setEmail(email);
        customer.setCreditCardNumber(creditCardNumber);
        return customer;
    }

    public static <T extends BaseCustomer> T generateCustomerExample(final String name,
                                                                     final String email,
                                                                     final String creditCardNumber,
                                                                     final Class<T> tClass) {
        try {
            final T customer = tClass.getDeclaredConstructor().newInstance();
            customer.setName(name);
            customer.setEmail(email);
            customer.setCreditCardNumber(creditCardNumber);
            return customer;
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
