// Written by Jürgen Moßgraber - mossgrabers.de
// (c) 2017-2018
// Licensed under LGPLv3 - http://www.gnu.org/licenses/lgpl-3.0.txt

package de.mossgrabers.push.bitwig;

import de.mossgrabers.framework.bitwig.extension.AbstractControllerExtensionDefinition;


/**
 * Abstract definition class for the Push controllers.
 *
 * @author J&uuml;rgen Mo&szlig;graber
 */
public abstract class PushControllerExtensionDefinition extends AbstractControllerExtensionDefinition
{
    /** {@inheritDoc} */
    @Override
    public String getName ()
    {
        return "Push4Bitwig";
    }


    /** {@inheritDoc} */
    @Override
    public String getHardwareVendor ()
    {
        return "Ableton";
    }


    /** {@inheritDoc} */
    @Override
    public String getVersion ()
    {
        return "9.51";
    }
}