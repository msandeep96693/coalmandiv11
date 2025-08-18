package BasicFlow;

import jakarta.mail.*;
import jakarta.mail.internet.MimeMultipart;
import jakarta.mail.search.FlagTerm;
import org.jsoup.Jsoup;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Code;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.io.IOException;
import java.util.*;
import java.util.regex.*;

public class ReadGmailOTP {
   
//        String host = "imap.gmail.com";
//        String username = "sandeep@rokkun.io"; // Replace with your Gmail
//        String password = "your_16_char_app_password"; // Gmail App Password
//
//        String otp = "OTP not found";
//
//        try {
//            // Setup IMAP properties
//            Properties properties = new Properties();
//            properties.put("mail.store.protocol", "imaps");
//            properties.put("mail.imap.host", host);
//            properties.put("mail.imap.port", "993");
//            properties.put("mail.imap.ssl.enable", "true");
//
//            // Create session and connect to Gmail
//            Session emailSession = Session.getInstance(properties);
//            Store store = emailSession.getStore();
//            store.connect(host, username, password);
//
//            // Open INBOX folder
//            Folder inbox = store.getFolder("INBOX");
//            inbox.open(Folder.READ_WRITE);
//
//            // Get unread messages
//            Message[] messages = inbox.search(new FlagTerm(new Flags(Flags.Flag.SEEN), false));
//
//            // Sort messages by sent date (oldest → newest)
//            Arrays.sort(messages, Comparator.comparing(m -> {
//                try {
//                    return m.getSentDate();
//                } catch (MessagingException e) {
//                    return new Date(0);
//                }
//            }));
//
//            // Loop from newest to oldest
//            for (int i = messages.length - 1; i >= 0; i--) {
//                Message msg = messages[i];
//                Address[] froms = msg.getFrom();
//                String sender = froms != null ? froms[0].toString() : "";
//
//                // Filter by Coalmandi sender
//                if (sender.toLowerCase().contains("coalmandi")) {
//                    String content = extractLatestEmailContent(msg);
//                    String foundOtp = extractOTP(content);
//                    if (!foundOtp.equals("OTP not found")) {
//                        otp = foundOtp;
//                        msg.setFlag(Flags.Flag.SEEN, true); // Mark as read
//                        break; // Stop after finding latest OTP
//                    }
//                }
//            }
//
//            inbox.close(false);
//            store.close();
//
//            System.out.println("Extracted OTP: " + otp);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return otp;
//    }
//
//    private static String extractLatestEmailContent(Message message) throws Exception {
//        if (message.isMimeType("text/plain")) {
//            return message.getContent().toString();
//        } else if (message.isMimeType("text/html")) {
//            return Jsoup.parse(message.getContent().toString()).text();
//        } else if (message.isMimeType("multipart/*")) {
//            return getLatestTextFromMimeMultipart((MimeMultipart) message.getContent());
//        }
//        return "";
//    }
//
//    private static String getLatestTextFromMimeMultipart(MimeMultipart mimeMultipart) throws Exception {
//        for (int i = 0; i < mimeMultipart.getCount(); i++) {
//            BodyPart bodyPart = mimeMultipart.getBodyPart(i);
//            if (bodyPart.isMimeType("text/plain")) {
//                return bodyPart.getContent().toString();
//            } else if (bodyPart.isMimeType("text/html")) {
//                return Jsoup.parse(bodyPart.getContent().toString()).text();
//            } else if (bodyPart.getContent() instanceof MimeMultipart) {
//                return getLatestTextFromMimeMultipart((MimeMultipart) bodyPart.getContent());
//            }
//        }
//        return "";
//    }
//
//    private static String extractOTP(String emailContent) {
//        Pattern pattern = Pattern.compile("\\b\\d{6}\\b"); // Match 6-digit number
//        Matcher matcher = pattern.matcher(emailContent);
//
//        String latestOTP = "OTP not found";
//        while (matcher.find()) {
//            latestOTP = matcher.group(); // Last found 6-digit number
//        }
//        return latestOTP;
//    }
//
//    public static void main(String[] args) {
//        fetchOTP();
//    }
    
    public static String fetchemailotp() throws IOException, MailosaurException
	{
		    String apiKey = "NtYQhOQxNRXPpDlZzL0LhLFV4msgk6AJ";
		    String serverId = "50ih2qmm";
		    String serverDomain = "50ih2qmm.mailosaur.net";
		    
		   
//		    anything@50ih2qmm.mailosaur.net


		    MailosaurClient mailosaur = new MailosaurClient(apiKey);

		    MessageSearchParams params = new MessageSearchParams();
		    params.withServer(serverId);

		    SearchCriteria criteria = new SearchCriteria();
		    criteria.withSentTo("anything@" + serverDomain);

		    Message message = mailosaur.messages().get(params, criteria);
//		    System.out.println(message.from().get(0).email());
//		    System.out.println(message.to().get(0).email());
//		    
//		    System.out.println("-------Body --------");
//		    System.out.println(message.text().body());
		    
		    assertNotNull(message);
		    assertEquals("Welcome to Coalmandi – Your OTP Code", message.subject());
		    
		    // otp fetch 
		    System.out.println(message.html().codes().size());
		    
		    Code firstcode = message.html().codes().get(0);
		    System.out.println("CODE  :- " +firstcode.value());
		    String OTP = firstcode.value().trim();
		    
		    

		   
			return OTP;
	}
}

