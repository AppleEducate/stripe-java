// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SourceTransaction extends StripeObject implements HasId {
  AchCreditTransferData achCreditTransfer;

  /**
   * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1,
   * Japanese Yen being a zero-decimal currency) representing the amount your customer has pushed to
   * the receiver.
   */
  Long amount;

  ChfCreditTransferData chfCreditTransfer;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  Long created;

  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  String currency;

  /** Unique identifier for the object. */
  @Getter(onMethod = @__({@Override}))
  String id;

  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object
   * exists in test mode.
   */
  Boolean livemode;

  /** String representing the object's type. Objects of the same type share the same value. */
  String object;

  PaperCheckData paperCheck;

  SepaCreditTransferData sepaCreditTransfer;

  /** The ID of the source this transaction is attached to. */
  String source;

  /** The status of the transaction, one of `succeeded`, `pending`, or `failed`. */
  String status;

  /** The type of source this transaction is attached to. */
  String type;

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AchCreditTransferData extends StripeObject {
    /** Customer data associated with the transfer. */
    String customerData;

    /** Bank account fingerprint associated with the transfer. */
    String fingerprint;

    /** Last 4 digits of the account number associated with the transfer. */
    String last4;

    /** Routing number associated with the transfer. */
    String routingNumber;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ChfCreditTransferData extends StripeObject {
    /** Reference associated with the transfer. */
    String reference;

    /** Sender's country address. */
    String senderAddressCountry;

    /** Sender's line 1 address. */
    String senderAddressLine1;

    /** Sender's bank account IBAN. */
    String senderIban;

    /** Sender's name. */
    String senderName;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PaperCheckData extends StripeObject {
    /** String unix time for the available date. */
    String availableAt;

    /** Invoice ID associated with the paper check. */
    String invoices;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SepaCreditTransferData extends StripeObject {
    /** Reference associated with the transfer. */
    String reference;

    /** Sender's bank account IBAN. */
    String senderIban;

    /** Sender's name. */
    String senderName;
  }
}