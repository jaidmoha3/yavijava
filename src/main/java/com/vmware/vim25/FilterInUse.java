package com.vmware.vim25;
<<<<<<< HEAD
/**
 * Copyright 2015 
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */


/**
 * 
 * A FilterInUse fault indicates that some error has occurred because an IO filter was in use.
 *
 * @author Jaidil Karippara
 * @version 1.0
 * @since vSphere 6.0
 */


@SuppressWarnings("all")
public class FilterInUse extends ResourceInUse {
  public VirtualDiskId[] disk;

public VirtualDiskId[] getDisk() {
    return disk;
}

public void setDisk(VirtualDiskId[] disk) {
    this.disk = disk;
}

  
}
=======

/**
 * Created by Michael Rice on Thu May 21 01:07:54 CDT 2015
 * <p/>
 * Copyright 2015 Michael Rice
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @since 6.0
 */

public class FilterInUse extends ResourceInUse {
    public VirtualDiskId[] disk;

    public VirtualDiskId[] getDisk() {
        return disk;
    }

    public void setDisk(VirtualDiskId[] disk) {
        this.disk = disk;
    }

}
>>>>>>> upstream/vsphere_6