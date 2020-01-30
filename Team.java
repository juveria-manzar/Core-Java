public class Team{
    Member member; 
    public Team(Member member){
        this.member=member;//One member is in this team!
    }

    public static void main(String...a){
        Member memberObj=new Member("Sara", "Student", 2, 1);
        Team team=new Team(memberObj);
        System.out.println(team.member.getName());
        System.out.println(team.member.getType());
        System.out.println(team.member.getLevel());
        System.out.println(team.member.getRank());

    }
}

class Member{
    private String name;
    private String type;
    private int level;
    private int rank;

    public Member(String name,String type,int level,int rank){
        this.name=name;
        this.type=type;
        this.level=level;
        this.rank=rank;
    }

    public String getName(){
        return this.name;
    }

    public String getType(){
        return this.type;
    }

    public int getLevel(){
        return this.level;
    }

    public int getRank(){
        return this.rank;
    }
}