package Day06;

public class D6t6 {
    public static void main(String[] args) {
        MyDate pd = new MyDate(1900,1,1);
        pd.showDate();
        boolean f=pd.isBi();
        if(f==true){
            System.out.println(pd.year + "年是闰年");
        }else{
            System.out.println(pd.year+"年不是闰年");
        }
        //pd.isBi();
    }
}
    class MyDate {
        int year;
        int month;
        int day;

        public MyDate(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public void showDate() {
            System.out.println("日期:" + year + "年" + month + "月" + day + "日");
        }

        public boolean isBi() {
            if (year % 100 != 0) {
                if (year % 4 == 0) {
                    return true;//System.out.println(year + "年是闰年");
                } else {
                    return  false;//System.out.println(year + "年不是闰年");
                }
            } else if (year % 400 == 0) {
                return true;//System.out.println(year + "年是闰年");
            }
            return false;//System.out.println(year + "年不是闰年");
        }
    }

