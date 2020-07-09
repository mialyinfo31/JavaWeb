package fr.mia.java_web.model;

public class JournalistBean {
    private int id_journaliste;
    private String login;
    private String password;
    private int credit;

    @Override
    public String toString() {
        return "Journaliste{" +
                "id_journaliste=" + id_journaliste +
                ", login='" + login + '\'' +
                ", credit=" + password +
                ", credit=" + credit +
                '}';
    }

    /**
     * Constructor
     */
    public JournalistBean() {
    }

    public JournalistBean(String login, int credit) {
        super();
        this.login = login;
        this.credit = credit;
    }

    public JournalistBean(String login, String password, int credit) {
        this.login = login;
        this.password = password;
        this.credit = credit;
    }

    /**
     * Getters and setters
     */
    public int getId_journaliste() {
        return id_journaliste;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getCredit() {
        return credit;
    }
}

