package creational.builder;

public class Phone {
    
    String company;

    Integer ram;

    String processor;

    String os;

    public Phone(String company, Integer ram, String processor, String os) {
        this.company = company;
        this.ram = ram;
        this.processor = processor;
        this.os = os;
    }

    public String getCompany() {
        return company;
    }

    public Integer getRam() {
        return ram;
    }

    public String getProcessor() {
        return processor;
    }

    public String getOs() {
        return os;
    }

    @Override
    public String toString() {
        return "Phone [company=" + company + ", os=" + os + ", processor=" + processor + ", ram=" + ram + "]";
    }

}
