class Solution {

    public String validIPAddress(String queryIP) {

        if (queryIP.contains(".")) {
            return checkIPv4(queryIP) ? "IPv4" : "Neither";
        }

        if (queryIP.contains(":")) {
            return checkIPv6(queryIP) ? "IPv6" : "Neither";
        }

        return "Neither";
    }

    private boolean checkIPv4(String ip) {

        String[] parts = ip.split("\\.", -1);

        if (parts.length != 4) {
            return false;
        }

        for (String part : parts) {


            if (part.length() == 0) {
                return false;
            }

            if (part.length() > 1 && part.charAt(0) == '0') {
                return false;
            }

             if (part.length() > 3) {
            return false;
        }
           
            for (char c : part.toCharArray()) {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }

            int num = Integer.parseInt(part);

            if (num > 255) {
                return false;
            }
        }

        return true;
    }

    private boolean checkIPv6(String ip) {

        String[] parts = ip.split(":", -1);

        if (parts.length != 8) {
            return false;
        }

        for (String part : parts) {

          
            if (part.length() < 1 || part.length() > 4) {
                return false;
            }

            
            for (char c : part.toCharArray()) {

                if (!Character.isDigit(c) &&
                    !(c >= 'a' && c <= 'f') &&
                    !(c >= 'A' && c <= 'F')) {

                    return false;
                }
            }
        }

        return true;
    }
}