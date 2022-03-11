/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.rocketmq.proxy.configuration;

import org.apache.rocketmq.proxy.grpc.common.ProxyMode;

public class ProxyConfig {
    public final static String CONFIG_FILE_NAME = "rmq-proxy.json";

    /**
     * Configuration for proxy
     */
    private Integer healthCheckPort = 8000;
    private long waitAfterStopHealthCheckInSeconds = 40;

    /**
     * configuration for ThreadPoolMonitor
     */
    private boolean enablePrintJstack = true;
    private long printJstackPeriodMillis = 60000;

    /**
     * gRPC
     */
    private String proxyMode = ProxyMode.CLUSTER.name();
    private Boolean startGrpcServer = true;
    private Integer grpcServerPort = 8081;
    private String grpcTlsKeyPath = ConfigurationManager.getProxyHome() + "/conf/tls/gRPC.key.pem";
    private String grpcTlsCertPath = ConfigurationManager.getProxyHome() + "/conf/tls/gRPC.chain.cert.pem";
    private int grpcBossLoopNum = 1;
    private int grpcWorkerLoopNum = Runtime.getRuntime().availableProcessors() * 2;
    private int grpcThreadPoolNums = 16 + Runtime.getRuntime().availableProcessors() * 2;
    private int grpcThreadPoolQueueCapacity = 100000;
    private String brokerConfigPath = ConfigurationManager.getProxyHome() + "/conf/broker.conf";
    /**
     * gRPC max message size
     * 130M = 4M * 32 messages + 2M attributes
     */
    private int grpcMaxInboundMessageSize = 130 * 1024 * 1024;

    public Integer getHealthCheckPort() {
        return healthCheckPort;
    }

    public void setHealthCheckPort(Integer healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
    }

    public long getWaitAfterStopHealthCheckInSeconds() {
        return waitAfterStopHealthCheckInSeconds;
    }

    public void setWaitAfterStopHealthCheckInSeconds(long waitAfterStopHealthCheckInSeconds) {
        this.waitAfterStopHealthCheckInSeconds = waitAfterStopHealthCheckInSeconds;
    }

    public boolean isEnablePrintJstack() {
        return enablePrintJstack;
    }

    public void setEnablePrintJstack(boolean enablePrintJstack) {
        this.enablePrintJstack = enablePrintJstack;
    }

    public long getPrintJstackPeriodMillis() {
        return printJstackPeriodMillis;
    }

    public void setPrintJstackPeriodMillis(long printJstackPeriodMillis) {
        this.printJstackPeriodMillis = printJstackPeriodMillis;
    }

    public String getProxyMode() {
        return proxyMode;
    }

    public void setProxyMode(String proxyMode) {
        this.proxyMode = proxyMode;
    }

    public Boolean getStartGrpcServer() {
        return startGrpcServer;
    }

    public void setStartGrpcServer(Boolean startGrpcServer) {
        this.startGrpcServer = startGrpcServer;
    }

    public Integer getGrpcServerPort() {
        return grpcServerPort;
    }

    public void setGrpcServerPort(Integer grpcServerPort) {
        this.grpcServerPort = grpcServerPort;
    }

    public String getGrpcTlsKeyPath() {
        return grpcTlsKeyPath;
    }

    public void setGrpcTlsKeyPath(String grpcTlsKeyPath) {
        this.grpcTlsKeyPath = grpcTlsKeyPath;
    }

    public String getGrpcTlsCertPath() {
        return grpcTlsCertPath;
    }

    public void setGrpcTlsCertPath(String grpcTlsCertPath) {
        this.grpcTlsCertPath = grpcTlsCertPath;
    }

    public int getGrpcBossLoopNum() {
        return grpcBossLoopNum;
    }

    public void setGrpcBossLoopNum(int grpcBossLoopNum) {
        this.grpcBossLoopNum = grpcBossLoopNum;
    }

    public int getGrpcWorkerLoopNum() {
        return grpcWorkerLoopNum;
    }

    public void setGrpcWorkerLoopNum(int grpcWorkerLoopNum) {
        this.grpcWorkerLoopNum = grpcWorkerLoopNum;
    }

    public int getGrpcThreadPoolNums() {
        return grpcThreadPoolNums;
    }

    public void setGrpcThreadPoolNums(int grpcThreadPoolNums) {
        this.grpcThreadPoolNums = grpcThreadPoolNums;
    }

    public int getGrpcThreadPoolQueueCapacity() {
        return grpcThreadPoolQueueCapacity;
    }

    public void setGrpcThreadPoolQueueCapacity(int grpcThreadPoolQueueCapacity) {
        this.grpcThreadPoolQueueCapacity = grpcThreadPoolQueueCapacity;
    }

    public String getBrokerConfigPath() {
        return brokerConfigPath;
    }

    public void setBrokerConfigPath(String brokerConfigPath) {
        this.brokerConfigPath = brokerConfigPath;
    }

    public int getGrpcMaxInboundMessageSize() {
        return grpcMaxInboundMessageSize;
    }

    public void setGrpcMaxInboundMessageSize(int grpcMaxInboundMessageSize) {
        this.grpcMaxInboundMessageSize = grpcMaxInboundMessageSize;
    }
}
