public class JavaBuzz {
public String convert(int toConvertToJavaBuzz) {
        if(toConvertToJavaBuzz % 15 == 0 ) {
                return "JavaBuzz";
        }else if(toConvertToJavaBuzz % 5 == 0 ) {
                return "Buzz";
        }else if(toConvertToJavaBuzz % 3 == 0 ) {
                return "Java";
        }else{
                return String.valueOf(toConvertToJavaBuzz);
        }
}
}
