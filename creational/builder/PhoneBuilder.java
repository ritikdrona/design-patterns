package creational.builder;

public class PhoneBuilder {
    
    String company;

    Integer ram;

    String processor;

    String os;

    PhoneBuilder company(String company) {
        this.company = company;
        return this;
    }

    PhoneBuilder ram(Integer ram) {
        this.ram = ram;
        return this;
    }

    PhoneBuilder processor(String processor) {
        this.processor = processor;
        return this;
    }

    PhoneBuilder os(String os) {
        this.os = os;
        return this;
    }

    Phone getPhone() {
        return new Phone(this.company, this.ram, this.processor, this.os);
    }

}
