/*
 * This file is part of Discord4J.
 *
 * Discord4J is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Discord4J is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Discord4J.  If not, see <http://www.gnu.org/licenses/>.
 */
package discord4j.voice.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SentSpeaking extends VoiceGatewayPayload<SentSpeaking.Data> {

    public SentSpeaking(boolean speaking, int delay, int ssrc) {
        super(5, new Data(speaking, delay, ssrc));
    }

    public static class Data {

        private final boolean speaking;
        private final int delay;
        private final int ssrc;

        public Data(boolean speaking, int delay, int ssrc) {
            this.speaking = speaking;
            this.delay = delay;
            this.ssrc = ssrc;
        }

        @JsonProperty("speaking")
        public boolean isSpeaking() {
            return speaking;
        }

        public int getDelay() {
            return delay;
        }

        public int getSsrc() {
            return ssrc;
        }
    }
}
