package player;

public class Player {
    private Long id;
    private String name;
    private String surname;
    private int points;
    // @ManyToOne // un jugador sólo puede pertenecer a un equipo
    // private Team team;

    /* Constructores */

    public Player(long id, String name, String surname, int points) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.points = points;
    }

    public Player(){
    }

    /* Getters */

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPoints() {
        return points;
    }

    // public Team getTeam() { return team; }

    /* Setters */

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    // public void setTeam(Team team) {this.team = team;}

    //    @Override
    //    public String toString() {
    //        return name + " " + surname;
    //    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", points=" + points +
                '}' + System.lineSeparator();
    }
}
