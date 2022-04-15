import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumPhoneExample {
    /*
    Viết phương thức để kiểm tra tính hợp lệ của số điên thoại.

    Số điện thoại hợp lệ cần đạt theo mẫu sau: (xx)-(0xxxxxxxxx)

    x là ký tự số

    Không chứa các ký tự đặc biệt

    Ví dụ số điện thoại hợp lệ: (84)-(0978489648)

    Ví dụ tên lớp không hợp lệ: (a8)-(22222222)
     */

    private static final String PHONE_REGEX = "^[09|03]+[0-9]{8}$";

    public NumPhoneExample() {
    }

    public boolean validate(String regex){
        Pattern p = Pattern.compile(PHONE_REGEX);
        Matcher m = p.matcher(regex);
        return m.matches();
    }
}
