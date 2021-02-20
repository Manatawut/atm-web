package th.ac.ku.atm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import th.ac.ku.atm.model.BankAccount;

import java.util.ArrayList;

@Controller
public class BankAccountController {
    private

    ArrayList<BankAccount> bankAccounts = new ArrayList<>();
    @GetMapping("/bankaccount")
    public String getBankAccountPage(Model model) {
        model.addAttribute("allBankAccount", bankAccounts);
        return "bankaccount";
    }
    @PostMapping("/bankaccount")
    public String registerBankAccount(@ModelAttribute BankAccount bankAccount,Model model) {
        bankAccounts.add(bankAccount);
        model.addAttribute("allBankAccount",bankAccounts);
        return "redirect:bankaccount";
    }

}
