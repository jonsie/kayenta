/*
 * Copyright 2018 Armory, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.kayenta.datadog.config;

import lombok.Getter;
import lombok.Setter;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DatadogConfigurationProperties {

  @Getter
  @Setter
  private long metadataCachingIntervalMS = Duration.ofSeconds(60).toMillis();

  @Getter
  @Setter
  //The control and experimental groups are scoped by Orca with the server group name.  So, if you were deploying an EC2
  //server group the autoscaling group name would be tagged with `autoscaling_group`.
  private String canaryScopeTag;

  @Getter
  private List<DatadogManagedAccount> accounts = new ArrayList<>();
}
