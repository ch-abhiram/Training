package first.src.M1.LibraryManagment;

public class Member {
    private int mId;
    private String name;
    private String city;
    private String memberType;

    public Member(int mId, String name, String city, String memberType) {
        this.mId = mId;
        this.name = name;
        this.city = city;
        this.memberType = memberType;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Member{" +
                "mId=" + mId +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", memberType='" + memberType + '\'' +
                '}';
    }
}
