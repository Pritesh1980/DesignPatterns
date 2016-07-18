package net.pritesh.patterns.behavioral.chainOfResponsibility;


public class Email
{
    private String headers;
    private String subject;
    private String body;

    public Email( String headers, String subject, String body )
    {
        this.headers = headers;
        this.subject = subject;
        this.body = body;
    }

    public String getHeaders()
    {
        return headers;
    }

    public String getSubject()
    {
        return subject;
    }

    public String getBody()
    {
        return body;
    }
}
