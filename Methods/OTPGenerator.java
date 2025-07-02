import java.util.*;

public class OTPGenerator {

    // 1. Generate a 6-digit OTP
    public static String generateOTP() {
        int otp = (int)(100000 + Math.random() * 900000); // ensures 6-digit
        return String.valueOf(otp);
    }

    // 2. Generate 10 OTPs
    public static String[] generateMultipleOTPs(int count) {
        String[] otps = new String[count];
        for (int i = 0; i < count; i++) {
            otps[i] = generateOTP();
        }
        return otps;
    }

    // 3. Check uniqueness
    public static boolean areOTPsUnique(String[] otps) {
        Set<String> set = new HashSet<>(Arrays.asList(otps));
        return set.size() == otps.length;
    }

    public static void main(String[] args) {
        String[] otpArray = generateMultipleOTPs(10);
        System.out.println("Generated OTPs: " + Arrays.toString(otpArray));
        boolean unique = areOTPsUnique(otpArray);
        System.out.println("Are OTPs Unique? " + unique);
    }
}
