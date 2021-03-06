/*
 * Copyright (C) 2017 The Android Open Source Project
 *
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

package android.net.ip;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyInt;

import android.net.util.SharedLog;
import android.support.test.filters.SmallTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


/**
 * Tests for IpReachabilityMonitor.
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class IpReachabilityMonitorTest {

    @Mock IpReachabilityMonitor.Callback mCallback;
    @Mock IpReachabilityMonitor.Dependencies mDependencies;
    @Mock SharedLog mLog;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    IpReachabilityMonitor makeMonitor() {
        return new IpReachabilityMonitor("fake0", 1, mLog, mCallback, null, mDependencies);
    }

    @Test
    public void testNothing() {
        IpReachabilityMonitor monitor = makeMonitor();
    }
}
