package pl.kuklake.szabud;

import org.springframework.data.repository.CrudRepository;


/**
 * Created by aniela on 11.03.15.
 */

public interface ExpenseRepository extends CrudRepository<Expense, String> {

}
