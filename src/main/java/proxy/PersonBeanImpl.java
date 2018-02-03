package proxy;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2018/2/3 22:40
 */
public class PersonBeanImpl implements PersonBean {
    String name;
    String gender;
    String insterests;
    int rating;
    int ratingCount = 0;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return insterests;
    }

    @Override
    public int getHotOrNotRating() {
        if (rating == 0) return 0;
        return rating / ratingCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
        this.insterests = interests;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }
}
