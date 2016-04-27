package org.graylog2.alarmcallbacks.jabber;

import org.graylog2.plugin.PluginMetaData;
import org.graylog2.plugin.ServerStatus;
import org.graylog2.plugin.Version;

import java.net.URI;
import java.util.Collections;
import java.util.Set;

public class JabberAlarmCallbackMetadata implements PluginMetaData {
    @Override
    public String getUniqueId() {
        return JabberAlarmCallback.class.getCanonicalName();
    }

    @Override
    public String getName() {
        return "Jabber Alarmcallback Plugin";
    }

    @Override
    public String getAuthor() {
        return "Graylog, Inc.";
    }

    @Override
    public URI getURL() {
        return URI.create("https://www.graylog.org");
    }

    @Override
    public Version getVersion() {
        return new Version(1, 2, 1);
    }

    @Override
    public String getDescription() {
        return "Alarm callback plugin that sends all stream alerts to a defined Jabber/XMPP recipient.";
    }

    @Override
    public Version getRequiredVersion() {
        return new Version(2, 0, 0);
    }

    @Override
    public Set<ServerStatus.Capability> getRequiredCapabilities() {
        return Collections.emptySet();
    }
}
