/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.revelc.code.formatter.html;

import net.revelc.code.formatter.Formatter;
import java.util.Map;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.jsoup.JsoupBasedFormatter;

/**
 * @author yoshiman
 *
 */
public class HTMLFormatter extends JsoupBasedFormatter implements Formatter {

    public HTMLFormatter() {
        extensions = new String[]{".html"};
    }

    @Override
    public void init(Map<String, String> options, ConfigurationSource cfg) {
        super.initCfg(cfg);
    }

    @Override
    public String doFormat(String code, LineEnding ending) {
        return super.doFormat(code, ending);
    }

}
