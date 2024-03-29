/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.sling.commons.messaging;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.NotNull;
import org.osgi.annotation.versioning.ProviderType;

/**
 * Service for sending messages.
 *
 * @param <S> the type of result returned by send operation
 * @param <T> the type of message to send
 */
@ProviderType
public interface MessageService<T, S> {

    /**
     * Sends the given message.
     *
     * @param message the message to send
     * @return the result of send operation
     */
    public abstract @NotNull CompletableFuture<S> sendMessage(@NotNull final T message);

}
