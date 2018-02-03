package proxy;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2018/2/3 22:37
 */
public interface PersonBean {
    String getName();

    String getGender();

    String getInterests();

    int getHotOrNotRating();

    void setName(String name);

    void setGender(String gender);

    void setInterests(String interests);

    void setHotOrNotRating(int rating);
}
