public class color {
    private int c;

    public color(int color) {
        c = color;
    }

    public int getC() {
        return c;
    }

    public void setC(int color) {
        c = color;
    }

    public boolean checkDirectColorMatch(color c1, color c2) {
        int smaller = Math.min(c1.getC(), c2.getC());
        int larger = Math.max(c1.getC(), c2.getC());
        if (smaller + 6 = larger)
            return true;
        else
            return false;
    }

    public String checkTypeColorMatch(color c1, color c2) {
        String res = "";
        if (c1.getC() == c2.getC())
            res = "Don sac";
        else {
            int smaller = Math.min(c1.getC(), c2.getC());
            int larger = Math.max(c1.getC(), c2.getC());
            if (smaller + 1 = larger)
                res = "Tuong dong";
            else if (checkDirectColorMatch(c1, c2) == true)
                res = "Truc tiep";
            else
                res = "Ko phu hop voi bat ki quy tac phoi mau nao";
        }

        return res;


    }


}

