package leechwin.sendmail;

import org.apache.commons.mail.SimpleEmail;

/**
 * Simple SendMail Example.
 *
 * @author leechwin1@gmail.com
 */
public class SendMail {

    public static void main(String[] args) {
        SendMail mail = new SendMail();
        mail.testEmail();
    }

    @SuppressWarnings("deprecation")
    private void testEmail() {
        SimpleEmail mail = new SimpleEmail();

        mail.setHostName("smtp.gmail.com");
        mail.setTLS(true);
        mail.setSmtpPort(587);
        mail.setAuthentication("leechwin1", "****"); // Input email id/pass

        String result = "Failure";
        try {
            mail.addTo("leechwin1@gmail.com","changhyun", "utf-8");
            mail.setFrom("leechwin1@gmail.com", "changhyun", "utf-8");

            mail.setSubject("Test gmail");
            mail.setMsg("Test java email");

            result = mail.send();

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Result: " + result);
    }

}
