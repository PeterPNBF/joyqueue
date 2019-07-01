/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jd.joyqueue.server.retry.remote.command;

import com.jd.joyqueue.network.command.CommandType;
import com.jd.joyqueue.network.transport.command.JoyQueuePayload;
import com.jd.joyqueue.server.retry.model.RetryMessageModel;

import java.util.List;

/**
 * 创建重试数据
 * <p>
 * Created by chengzhiliang on 2019/2/14.
 */
public class PutRetry extends JoyQueuePayload {

    // 重试消息
    private List<RetryMessageModel> messages;

    public PutRetry(List<RetryMessageModel> messages) {
        this.messages = messages;
    }

    @Override
    public int type() {
        return CommandType.PUT_RETRY;
    }

    public List<RetryMessageModel> getMessages() {
        return messages;
    }

    public void setMessages(List<RetryMessageModel> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "PutRetry{" +
                "messages=" + messages +
                '}';
    }

}