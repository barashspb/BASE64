public class Coder {
    public static void main(String[] args){

        //use your stroke
        String encode = Base64.encode("Hello world".getBytes());
        System.out.println(encode);

        byte[] byteArray = Base64.decode(encode);
        System.out.println(new String(byteArray, 0, byteArray.length));
    }
}
