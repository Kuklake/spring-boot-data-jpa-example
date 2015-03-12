package pl.kuklake.szabud;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


/**
 * Created by aniela on 11.03.15.
 */

@RestController
@RequestMapping("/expense")
public class ExpenseController{

    @Autowired
    ExpenseRepository expenseRepository;


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody Expense save(@RequestBody Expense expense){
        return expenseRepository.save(expense);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    Iterable<Expense> getAll(){
        return expenseRepository.findAll();
    }

}
