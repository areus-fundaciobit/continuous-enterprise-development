package org.cedj.app.web.rest.core;

import java.net.URI;

import javax.xml.bind.annotation.XmlAttribute;

public class ResourceLink {

    private String rel;
    private URI href;
    private String type;

    // JAXB Serialization only
    @SuppressWarnings("unused")
    private ResourceLink() {
    }

    // TODO: Remove. Make sure we can map types for internal linking within the same resource
    public ResourceLink(String rel, URI href) {
        this.rel = rel;
        this.href = href;
    }

    public ResourceLink(String rel, URI href, String media) {
        this.rel = rel;
        this.href = href;
        this.type = media;
    }

    @XmlAttribute
    public String getHref() {
        if (href == null) {
            return null;
        }
        return href.toASCIIString();
    }

    @XmlAttribute
    public String getRel() {
        return rel;
    }

    @XmlAttribute
    public String getMediaType() {
        return type;
    }

    public void setHref(String href) {
        this.href = URI.create(href);
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public void setType(String type) {
        this.type = type;
    }
}
