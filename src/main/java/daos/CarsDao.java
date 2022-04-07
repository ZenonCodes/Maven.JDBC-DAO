package daos;

import java.util.Set;

public interface CarsDao {
    Cars getCar();
    Set<Cars> getAllCars();
    Cars getUserByUserNameAndPassword();
    boolean insertUser();
    boolean updateUser();
    boolean deleteUser();

}
