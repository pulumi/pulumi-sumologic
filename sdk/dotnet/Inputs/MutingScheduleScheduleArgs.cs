// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SumoLogic.Inputs
{

    public sealed class MutingScheduleScheduleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Duration of the muting in minutes
        /// </summary>
        [Input("duration", required: true)]
        public Input<int> Duration { get; set; } = null!;

        /// <summary>
        /// RRule (Recurrence Rule) Below are some examples of how to represent recurring events using the RRULE format:
        /// A rule occurring on the third Sunday of April would be as follows: `FREQ=YEARLY;BYMONTH=4;BYDAY=SU;BYSETPOS=3`
        /// An event occurring on the first and second Monday of October would be specified by the rule: `FREQ=YEARLY;BYMONTH=10;BYDAY=MO;BYSETPOS=1,2`
        /// Event that repeats monthly: every 29th of every other month! `FREQ=MONTHLY;INTERVAL=2;BYMONTHDAY=29`
        /// (https://freetools.textmagic.com/rrule-generator)
        /// </summary>
        [Input("rrule")]
        public Input<string>? Rrule { get; set; }

        /// <summary>
        /// Schedule start date in the format of `yyyy-mm-dd`
        /// </summary>
        [Input("startDate", required: true)]
        public Input<string> StartDate { get; set; } = null!;

        /// <summary>
        /// Schedule start time in the format of `hh:mm`
        /// </summary>
        [Input("startTime", required: true)]
        public Input<string> StartTime { get; set; } = null!;

        /// <summary>
        /// Time zone for the schedule per
        /// [IANA Time Zone Database](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones#List).
        /// </summary>
        [Input("timezone", required: true)]
        public Input<string> Timezone { get; set; } = null!;

        public MutingScheduleScheduleArgs()
        {
        }
        public static new MutingScheduleScheduleArgs Empty => new MutingScheduleScheduleArgs();
    }
}
