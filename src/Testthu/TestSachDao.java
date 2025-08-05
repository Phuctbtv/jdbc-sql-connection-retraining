package Testthu;

import DAO.SachDAO;
import model.Sach;

public class TestSachDao {
    public static void main(String[] args) {
       /* Sach sach1=new Sach("LTJV","Lập trình Java",50000,2025);
        SachDAO.getInstance().insert(sach1);*/ //đây là thêm 1 quyển sách
        //còn dưới là thêm 10 quyển sách
       /* for(int i=0;i<1000;i++){
            Sach sach = new Sach("LT"+i,"Lập trình i: "+i,50000,2025);
            SachDAO.getInstance().insert(sach);
        }*/
       /* //update
        Sach sach2 = new Sach("LT0","Lập trình C",1000,2003);
        SachDAO.getInstance().update( sach2 );*/
        //delete
        for (int i=0;i<109;i++){
            Sach sach = new Sach("LT"+i,"Lập trình i: "+i,50000,2025);
            SachDAO.getInstance().delete(sach);
        }
    }
}
