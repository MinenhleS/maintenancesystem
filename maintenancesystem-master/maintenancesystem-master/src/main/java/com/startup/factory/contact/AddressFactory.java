/*
 AddressFactory class
 4/07/2020
 215285840
 */

package com.startup.factory.contact;

import com.startup.entity.contact.Address;

public class AddressFactory {

    public static Address buildAddress(String physicalAddress, String postalAddress){

        return new Address.Builder()
                .physicalAddress(physicalAddress)
                .postalAddress(postalAddress)
                .build();
    }
}
