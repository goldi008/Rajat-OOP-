public class Driver
{
    public static void main(String[]arg)
    {
        AdminDepartment ad=new AdminDepartment();
        HrDepartment hr=new HrDepartment();
        TechDepartment td=new TechDepartment();

        System.out.println("Welcome to "+ad.departmentName());
        System.out.println(ad.getTodaysWork());
        System.out.println(ad.getWorkDeadline());
        System.out.println(ad.isTodayAHoliday());
        
        System.out.println("\n\n");

        System.out.println("Welcome to "+hr.departmentName());
        System.out.println(hr.doActivity());
        System.out.println(hr.getTodaysWork());
        System.out.println(hr.getWorkDeadline());
        System.out.println(hr.isTodayAHoliday());

        System.out.println("\n\n");
        
        System.out.println("Welcome to "+td.departmentName());
        System.out.println(td.getTodaysWork());
        System.out.println(td.getWorkDeadline());
        System.out.println(td.getTechStackInformation());
        System.out.println(hr.isTodayAHoliday());
    }
}