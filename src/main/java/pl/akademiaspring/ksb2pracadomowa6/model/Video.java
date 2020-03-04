package pl.akademiaspring.ksb2pracadomowa6.model;

public class Video {
    private String name;
    private Integer productionYear;
    private String producer;

    public Video() {}

    public Video(
            String name,
            Integer productionYear,
            String producer
    ) {
        this.name = name;
        this.productionYear = productionYear;
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
