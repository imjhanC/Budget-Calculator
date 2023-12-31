public class Converter {
    private String stringKey;

    public Converter(String key){
        this.stringKey = key;
    }

    public void setString(String key2){
        this.stringKey = key2;
    }

    public String getStringKey(){
        return stringKey;
    }

    public String encrypt(String str) {
        String substitutions = "abcdefghijklmnopqrstuvwxyz0123456789@._ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String replacement   = "z10hxspbwkmuvrd2jy6on3cq5t4a7iegl@f_9-8GLWURYHVOXZKMCNPEADSIBJFTQ";
        StringBuilder encryptedStr = new StringBuilder();
        char[] var7;
        int var6 = (var7 = str.toCharArray()).length;
  
        for(int var5 = 0; var5 < var6; ++var5) {
           char ch = var7[var5];
           int index = substitutions.indexOf(ch);
           if (index != -1) {
              encryptedStr.append(replacement.charAt(index));
           } else {
              encryptedStr.append(ch);
           }
        }
  
        return encryptedStr.toString();
    }

    public String decrypt(String str2) {
        String substitutions = "z10hxspbwkmuvrd2jy6on3cq5t4a7iegl@f_9-8GLWURYHVOXZKMCNPEADSIBJFTQ";
        String replacement   = "abcdefghijklmnopqrstuvwxyz0123456789@._ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder encryptedStr2 = new StringBuilder();
        char[] var7;
        int var6 = (var7 = str2.toCharArray()).length;
  
        for(int var5 = 0; var5 < var6; ++var5) {
           char ch = var7[var5];
           int index = substitutions.indexOf(ch);
           if (index != -1) {
              encryptedStr2.append(replacement.charAt(index));
           } else {
              encryptedStr2.append(ch);
           }
        }
  
        return encryptedStr2.toString();
    }
}
