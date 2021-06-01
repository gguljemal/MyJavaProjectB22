package day48_constructors_static;

import java.util.*;

public class Group {

    private String name;
    private List<String> members = new ArrayList<>();

    public Group(String name) {
        this.name = name;
    }

    public String getGroupName() {
        return name;
    }

    public void setGroupName(String groupName) {
        this.name = groupName;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {

        this.members = members;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + name + '\'' +
                ", members=" + members +
                '}';
    }

    public void addMember(String newMember) {
        members.add(newMember);
    }

    public void removeMember(String memberName) {
        members.remove(memberName);
    }
}
