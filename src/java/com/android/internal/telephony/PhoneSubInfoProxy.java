/*
 * Copyright (C) 2006 The Android Open Source Project
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

package com.android.internal.telephony;

import java.io.FileDescriptor;
import java.io.PrintWriter;

import android.os.RemoteException;
import android.os.ServiceManager;


public class PhoneSubInfoProxy extends IPhoneSubInfo.Stub {
    private PhoneSubInfo mPhoneSubInfo;

    public PhoneSubInfoProxy(PhoneSubInfo phoneSubInfo) {
        mPhoneSubInfo = phoneSubInfo;
    }

    public void setmPhoneSubInfo(PhoneSubInfo phoneSubInfo) {
        mPhoneSubInfo = phoneSubInfo;
    }

    @Override
    public String getDeviceId() {
        return mPhoneSubInfo.getDeviceId();
    }

    public String getImei() {
        return mPhoneSubInfo.getImei();
    }

    @Override
    public String getDeviceSvn() {
        return mPhoneSubInfo.getDeviceSvn();
    }

    /**
     * Retrieves the unique subscriber ID, e.g., IMSI for GSM phones.
     */
    @Override
    public String getSubscriberId() {
        return mPhoneSubInfo.getSubscriberId();
    }

    /**
     * Retrieves the Group Identifier Level1 for GSM phones.
     */
    public String getGroupIdLevel1() {
        return mPhoneSubInfo.getGroupIdLevel1();
    }

    /**
     * Retrieves the serial number of the ICC, if applicable.
     */
    @Override
    public String getIccSerialNumber() {
        return mPhoneSubInfo.getIccSerialNumber();
    }

    /**
     * Retrieves the phone number string for line 1.
     */
    @Override
    public String getLine1Number() {
        return mPhoneSubInfo.getLine1Number();
    }

    /**
     * Retrieves the alpha identifier for line 1.
     */
    @Override
    public String getLine1AlphaTag() {
        return mPhoneSubInfo.getLine1AlphaTag();
    }

    /**
     * Retrieves the MSISDN Number.
     */
    @Override
    public String getMsisdn() {
        return mPhoneSubInfo.getMsisdn();
    }

    /**
     * Retrieves the voice mail number.
     */
    @Override
    public String getVoiceMailNumber() {
        return mPhoneSubInfo.getVoiceMailNumber();
    }

    /**
     * Retrieves the complete voice mail number.
     */
    @Override
    public String getCompleteVoiceMailNumber() {
        return mPhoneSubInfo.getCompleteVoiceMailNumber();
    }

    /**
     * Retrieves the alpha identifier associated with the voice mail number.
     */
    @Override
    public String getVoiceMailAlphaTag() {
        return mPhoneSubInfo.getVoiceMailAlphaTag();
    }

    /**
     * Returns the IMS private user identity (IMPI) that was loaded from the ISIM.
     * @return the IMPI, or null if not present or not loaded
     */
    @Override
    public String getIsimImpi() {
        return mPhoneSubInfo.getIsimImpi();
    }

    /**
     * Returns the IMS home network domain name that was loaded from the ISIM.
     * @return the IMS domain name, or null if not present or not loaded
     */
    @Override
    public String getIsimDomain() {
        return mPhoneSubInfo.getIsimDomain();
    }

    /**
     * Returns the IMS public user identities (IMPU) that were loaded from the ISIM.
     * @return an array of IMPU strings, with one IMPU per string, or null if
     *      not present or not loaded
     */
    @Override
    public String[] getIsimImpu() {
        return mPhoneSubInfo.getIsimImpu();
    }

    @Override
    public String getDeviceIdUsingSubId(long subId) throws RemoteException {
        // FIXME: getDeviceIdUsingSubId
        return null;
    }

    @Override
    public String getImeiUsingSubId(long subId) throws RemoteException {
        // FIXME: getImeiUsingSubId
        return null;
    }

    @Override
    public String getSubscriberIdUsingSubId(long subId) throws RemoteException {
        // FIXME: getSubscriberIdUsingSubId
        return null;
    }

    @Override
    public String getGroupIdLevel1UsingSubId(long subId) throws RemoteException {
        // FIXME: getGroupIdLevel1UsingSubId
        return null;
    }

    @Override
    public String getIccSerialNumberUsingSubId(long subId) throws RemoteException {
        // FIXME: getIccSerialNumberUsingSubId
        return null;
    }

    @Override
    public String getLine1NumberUsingSubId(long subId) throws RemoteException {
        // FIXME: getLine1NumberUsingSubId
        return null;
    }

    @Override
    public String getLine1AlphaTagUsingSubId(long subId) throws RemoteException {
        // FIXME: getLine1AlphaTagUsingSubId
        return null;
    }

    @Override
    public String getMsisdnUsingSubId(long subId) throws RemoteException {
        // FIXME: getMsisdnUsingSubId
        return null;
    }

    @Override
    public String getVoiceMailNumberUsingSubId(long subId) throws RemoteException {
        // FIXME: getVoiceMailNumberUsingSubId
        return null;
    }

    @Override
    public String getCompleteVoiceMailNumberUsingSubId(long subId) throws RemoteException {
        // FIXME: getCompleteVoiceMailNumberUsingSubId
        return null;
    }

    @Override
    public String getVoiceMailAlphaTagUsingSubId(long subId) throws RemoteException {
        // FIXME: getVoiceMailAlphaTagUsingSubId
        return null;
    }

    /**
     * Returns the IMS Service Table (IST) that was loaded from the ISIM.
     * @return IMS Service Table or null if not present or not loaded
     */
    @Override
    public String getIsimIst() {
        return mPhoneSubInfo.getIsimIst();
    }

    /**
     * Returns the IMS Proxy Call Session Control Function(PCSCF) that were loaded from the ISIM.
     * @return an array of  PCSCF strings with one PCSCF per string, or null if
     *      not present or not loaded
     */
    @Override
    public String[] getIsimPcscf() {
        return mPhoneSubInfo.getIsimPcscf();
    }

    /**
     * Returns the response of ISIM Authetification through RIL.
     * Returns null if the Authentification hasn't been successed or isn't present iphonesubinfo.
     * @return the response of ISIM Authetification, or null if not available
     * @deprecated
     * @see getIccSimChallengeResponse
     */
    public String getIsimChallengeResponse(String nonce) {
        return mPhoneSubInfo.getIsimChallengeResponse(nonce);
    }

    /**
     * Returns the response of the SIM application on the UICC to authentication
     * challenge/response algorithm. The data string and challenge response are
     * Base64 encoded Strings.
     * Can support EAP-SIM, EAP-AKA with results encoded per 3GPP TS 31.102.
     *
     * @param appType ICC application type (@see com.android.internal.telephony.PhoneConstants#APPTYPE_xxx)
     * @param data authentication challenge data
     * @return challenge response
     */
    public String getIccSimChallengeResponse(long subId, int appType, String data) {
        return mPhoneSubInfo.getIccSimChallengeResponse(subId, appType, data);
    }

    @Override
    protected void dump(FileDescriptor fd, PrintWriter pw, String[] args) {
        mPhoneSubInfo.dump(fd, pw, args);
    }
}
