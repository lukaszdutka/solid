package pl.drogaprogramisty.srp.srp_broken;

public class MailSender {
    public void sendMail(CompanyProfit companyProfit, String email) {
        System.out.println("Sending mail... ");
        System.out.println("to: " + email);
        System.out.println("about: " + companyProfit);
    }
}
